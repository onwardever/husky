package info.yangdian.husky.log;

import org.slf4j.helpers.NOPLoggerFactory;

public class Slf4JLoggerFactory extends LoggerFactory
{
    public static final LoggerFactory INSTANCE = new Slf4JLoggerFactory();

    Slf4JLoggerFactory()
    {
        if(org.slf4j.LoggerFactory.getILoggerFactory() instanceof NOPLoggerFactory)
            throw new NoClassDefFoundError("NOPLoggerFactory not supported");
    }

    @Override
    protected Logger newInstance(String name)
    {
        return new Slf4JLogger(org.slf4j.LoggerFactory.getLogger(name));
    }
}
