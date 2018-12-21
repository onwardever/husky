package info.yangdian.husky.log;

import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;

class Log4J2Logger extends ExtendedLoggerWrapper implements Logger
{
    private static final long serialVersionUID = 1L;

    Log4J2Logger(org.apache.logging.log4j.Logger logger)
    {
        super((ExtendedLogger) logger, logger.getName(), logger.getMessageFactory());
    }

    @Override
    public String name()
    {
        return getName();
    }

    @Override
    public boolean isEnabled(Level level)
    {
        return isEnabled(toLevel(level));
    }

    @Override
    public void log(Level level, String msg)
    {
        log(toLevel(level), msg);
    }

    @Override
    public void log(Level level, String format, Object arg)
    {
        log(toLevel(level), format, arg);
    }

    @Override
    public void log(Level level, String format, Object argA, Object argB)
    {
        log(toLevel(level), format, argA, argB);
    }

    @Override
    public void log(Level level, String format, Object... arguments)
    {
        log(toLevel(level), format, arguments);
    }

    @Override
    public void log(Level level, String msg, Throwable t)
    {
        log(toLevel(level), msg, t);
    }

    private org.apache.logging.log4j.Level toLevel(Level level)
    {
        switch (level)
        {
            case TRACE:
                return org.apache.logging.log4j.Level.TRACE;
            case DEBUG:
                return org.apache.logging.log4j.Level.DEBUG;
            case INFO:
                return org.apache.logging.log4j.Level.INFO;
            case WARN:
                return org.apache.logging.log4j.Level.WARN;
            case ERROR:
                return org.apache.logging.log4j.Level.ERROR;
                default:
                    throw new Error();
        }
    }
}
