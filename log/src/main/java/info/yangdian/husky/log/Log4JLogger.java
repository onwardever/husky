package info.yangdian.husky.log;

import org.apache.log4j.Logger;

class Log4JLogger extends AbstractLogger
{
    private static final long serialVersionUID = 1L;

    final transient Logger logger;

    static final String FQCN = Log4JLogger.class.getName();

    // Does the log4j version in use recognize the TRACE level?
    // The trace level was introduced in log4j 1.2.12.
    final boolean traceCapable;

    Log4JLogger(Logger logger)
    {
        super(logger.getName());
        this.logger = logger;
        this.traceCapable = isTraceCapable();
    }

    @Override
    public boolean isTraceEnabled()
    {
        if(traceCapable)
            return logger.isTraceEnabled();
        else
            return logger.isDebugEnabled();
    }

    @Override
    public void trace(String msg)
    {
        logger.log(FQCN, traceCapable ? org.apache.log4j.Level.TRACE : org.apache.log4j.Level.DEBUG, msg, null);
    }

    @Override
    public void trace(String format, Object arg)
    {
        if (isTraceEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            logger.log(FQCN, traceCapable ? org.apache.log4j.Level.TRACE : org.apache.log4j.Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String format, Object argA, Object argB)
    {
        if (isTraceEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);
            logger.log(FQCN, traceCapable ? org.apache.log4j.Level.TRACE : org.apache.log4j.Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String format, Object... arguments)
    {
        if (isTraceEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
            logger.log(FQCN, traceCapable ? org.apache.log4j.Level.TRACE : org.apache.log4j.Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String msg, Throwable t)
    {
        logger.log(FQCN, traceCapable ? org.apache.log4j.Level.TRACE : org.apache.log4j.Level.DEBUG, msg, t);
    }

    @Override
    public boolean isDebugEnabled()
    {
        return logger.isDebugEnabled();
    }

    @Override
    public void debug(String msg)
    {
        logger.log(FQCN, org.apache.log4j.Level.DEBUG, msg, null);
    }

    @Override
    public void debug(String format, Object arg)
    {
        if (logger.isDebugEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            logger.log(FQCN, org.apache.log4j.Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String format, Object argA, Object argB)
    {
        if (logger.isDebugEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            logger.log(FQCN, org.apache.log4j.Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String format, Object... arguments)
    {
        if (logger.isDebugEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            logger.log(FQCN, org.apache.log4j.Level.DEBUG, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String msg, Throwable t)
    {
        logger.log(FQCN, org.apache.log4j.Level.DEBUG, msg, t);
    }

    @Override
    public boolean isInfoEnabled()
    {
        return logger.isInfoEnabled();
    }

    @Override
    public void info(String msg)
    {
        logger.log(FQCN, org.apache.log4j.Level.INFO, msg, null);
    }

    @Override
    public void info(String format, Object arg)
    {
        if (logger.isInfoEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            logger.log(FQCN, org.apache.log4j.Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String format, Object argA, Object argB)
    {
        if (logger.isInfoEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            logger.log(FQCN, org.apache.log4j.Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String format, Object... arguments)
    {
        if (logger.isInfoEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            logger.log(FQCN, org.apache.log4j.Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String msg, Throwable t)
    {
        logger.log(FQCN, org.apache.log4j.Level.INFO, msg, t);
    }

    @Override
    public boolean isWarnEnabled()
    {
        return logger.isEnabledFor(org.apache.log4j.Level.WARN);
    }

    @Override
    public void warn(String msg)
    {
        logger.log(FQCN, org.apache.log4j.Level.WARN, msg, null);
    }

    @Override
    public void warn(String format, Object arg)
    {
        if (logger.isEnabledFor(org.apache.log4j.Level.WARN))
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            logger.log(FQCN, org.apache.log4j.Level.WARN, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String format, Object argA, Object argB)
    {
        if (logger.isEnabledFor(org.apache.log4j.Level.WARN))
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            logger.log(FQCN, org.apache.log4j.Level.WARN, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String format, Object... arguments)
    {
        if (logger.isEnabledFor(org.apache.log4j.Level.WARN))
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            logger.log(FQCN, org.apache.log4j.Level.WARN, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String msg, Throwable t)
    {
        logger.log(FQCN, org.apache.log4j.Level.WARN, msg, t);
    }

    @Override
    public boolean isErrorEnabled()
    {
        return logger.isEnabledFor(org.apache.log4j.Level.ERROR);
    }

    @Override
    public void error(String msg)
    {
        logger.log(FQCN, org.apache.log4j.Level.ERROR, msg, null);
    }

    @Override
    public void error(String format, Object arg)
    {
        if (logger.isEnabledFor(org.apache.log4j.Level.ERROR))
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            logger.log(FQCN, org.apache.log4j.Level.ERROR, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String format, Object argA, Object argB)
    {
        if (logger.isEnabledFor(org.apache.log4j.Level.ERROR))
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            logger.log(FQCN, org.apache.log4j.Level.ERROR, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String format, Object... arguments)
    {
        if (logger.isEnabledFor(org.apache.log4j.Level.ERROR))
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            logger.log(FQCN, org.apache.log4j.Level.ERROR, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String msg, Throwable t)
    {
        logger.log(FQCN, org.apache.log4j.Level.ERROR, msg, t);
    }

    private boolean isTraceCapable()
    {
        try
        {
            logger.isTraceEnabled();
            return true;
        }
        catch (NoSuchMethodError ignored)
        {
            return false;
        }
    }
}
