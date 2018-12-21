package info.yangdian.husky.log;

public class JDKLoggerFactory extends LoggerFactory
{
    public static final LoggerFactory INSTANCE = new JDKLoggerFactory();

    private JDKLoggerFactory() {}

    @Override
    protected Logger newInstance(String name)
    {
        return new JDKLogger(java.util.logging.Logger.getLogger(name));
    }
}
