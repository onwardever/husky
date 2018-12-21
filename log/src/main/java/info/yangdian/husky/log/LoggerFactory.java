package info.yangdian.husky.log;

public abstract class LoggerFactory
{
    private static volatile LoggerFactory defaultFactory;

    private static LoggerFactory newDefaultFactory(String name)
    {
        LoggerFactory factory;

        try
        {
            factory = new Slf4JLoggerFactory();

            factory.newInstance(name).debug("Using SLF4J as the default logging framework");
        }
        catch (Throwable t1)
        {
            try
            {
                factory = Log4J2LoggerFactory.INSTANCE;

                factory.newInstance(name).debug("Using Log4J 2 as the default logging framework");
            }
            catch (Throwable t2)
            {
                try
                {
                    factory = Log4JLoggerFactory.INSTANCE;

                    factory.newInstance(name).debug("Using Log4J as the default logging framework");
                }
                catch (Throwable t3)
                {
                    factory = JDKLoggerFactory.INSTANCE;

                    factory.newInstance(name).debug("Using java.util.logging as the default logging framework");
                }
            }
        }

        return factory;
    }

    public static LoggerFactory getDefaultFactory()
    {
        if(defaultFactory==null)
            defaultFactory = newDefaultFactory(LoggerFactory.class.getName());

        return defaultFactory;
    }

    public static void setDefaultFactory(LoggerFactory defaultFactory)
    {
        if(defaultFactory==null)
            throw new NullPointerException("default factory is null");

        LoggerFactory.defaultFactory = defaultFactory;
    }

    public static Logger getInstance(Class<?> clazz)
    {
        return getInstance(clazz.getName());
    }

    public static Logger getInstance(String name)
    {
        return getDefaultFactory().newInstance(name);
    }

    protected abstract Logger newInstance(String name);
}
