package info.yangdian.husky.log;

import org.apache.logging.log4j.LogManager;

public class Log4J2LoggerFactory extends LoggerFactory
{
    public static final LoggerFactory INSTANCE = new Log4J2LoggerFactory();

    private Log4J2LoggerFactory() {}

    @Override
    protected Logger newInstance(String name)
    {
        return new Log4J2Logger(LogManager.getLogger(name));
    }
}
