package info.yangdian.husky.log;

import java.io.Serializable;

public abstract class AbstractLogger
    implements Logger, Serializable
{
    private static final long serialVersionUID = 1L;

    private String name;

    protected AbstractLogger(String name)
    {
        if(name==null)
            throw new NullPointerException("name cannot be null");

        this.name = name;
    }

    public String name()
    {
        return this.name;
    }

    @Override
    public boolean isEnabled(Level level)
    {
        switch (level)
        {
            case TRACE:
                return isTraceEnabled();
            case DEBUG:
                return isDebugEnabled();
            case INFO:
                return isInfoEnabled();
            case WARN:
                return isWarnEnabled();
            case ERROR:
                return isErrorEnabled();
            default:
                throw new Error();
        }
    }

    @Override
    public void log(Level level, String msg)
    {
        switch (level)
        {
            case TRACE:
                trace(msg);
                break;
            case DEBUG:
                debug(msg);
                break;
            case INFO:
                info(msg);
                break;
            case WARN:
                warn(msg);
                break;
            case ERROR:
                error(msg);
                break;
            default:
                throw new Error();
        }
    }

    @Override
    public void log(Level level, String format, Object arg)
    {
        switch (level)
        {
            case TRACE:
                trace(format, arg);
                break;
            case DEBUG:
                debug(format, arg);
                break;
            case INFO:
                info(format, arg);
                break;
            case WARN:
                warn(format, arg);
                break;
            case ERROR:
                error(format, arg);
                break;
            default:
                throw new Error();
        }
    }

    @Override
    public void log(Level level, String format, Object argA, Object argB)
    {
        switch (level)
        {
            case TRACE:
                trace(format, argA, argB);
                break;
            case DEBUG:
                debug(format, argA, argB);
                break;
            case INFO:
                info(format, argA, argB);
                break;
            case WARN:
                warn(format, argA, argB);
                break;
            case ERROR:
                error(format, argA, argB);
                break;
            default:
                throw new Error();
        }
    }

    @Override
    public void log(Level level, String format, Object... arguments)
    {
        switch (level)
        {
            case TRACE:
                trace(format, arguments);
                break;
            case DEBUG:
                debug(format, arguments);
                break;
            case INFO:
                info(format, arguments);
                break;
            case WARN:
                warn(format, arguments);
                break;
            case ERROR:
                error(format, arguments);
                break;
            default:
                throw new Error();
        }
    }

    @Override
    public void log(Level level, String msg, Throwable t)
    {
        switch (level)
        {
            case TRACE:
                trace(msg, t);
                break;
            case DEBUG:
                debug(msg, t);
                break;
            case INFO:
                info(msg, t);
                break;
            case WARN:
                warn(msg, t);
                break;
            case ERROR:
                error(msg, t);
                break;
            default:
                throw new Error();
        }
    }
}
