package info.yangdian.husky.log;

public class Log4JLoggerFactory extends LoggerFactory
{
    public static final LoggerFactory INSTANCE = new Log4JLoggerFactory();

    private Log4JLoggerFactory() {}

    @Override
    protected Logger newInstance(String name)
    {
        return new Log4JLogger(org.apache.log4j.Logger.getLogger(name));
    }

}
