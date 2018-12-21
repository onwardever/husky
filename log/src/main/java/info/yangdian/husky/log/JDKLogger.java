package info.yangdian.husky.log;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

class JDKLogger extends AbstractLogger
{
    private static final long serialVersionUID = 1L;

    private final transient Logger logger;

    private static final String SELF = JDKLogger.class.getName();

    private static final String SUPER = AbstractLogger.class.getName();

    JDKLogger(Logger logger)
    {
        super(logger.getName());
        this.logger = logger;
    }

    @Override
    public boolean isTraceEnabled()
    {
        return logger.isLoggable(java.util.logging.Level.FINEST);
    }

    @Override
    public void trace(String msg)
    {
        if(isTraceEnabled())
            log(SELF, java.util.logging.Level.FINEST, msg, null);
    }

    @Override
    public void trace(String format, Object arg)
    {
        if(isTraceEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            log(SELF, java.util.logging.Level.FINEST, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String format, Object argA, Object argB)
    {
        if (isTraceEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            log(SELF, java.util.logging.Level.FINEST, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String format, Object... arguments)
    {
        if (isTraceEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            log(SELF, java.util.logging.Level.FINEST, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void trace(String msg, Throwable t)
    {
        if (isTraceEnabled())
        {
            log(SELF, java.util.logging.Level.FINEST, msg, t);
        }
    }

    @Override
    public boolean isDebugEnabled()
    {
        return logger.isLoggable(java.util.logging.Level.FINE);
    }

    @Override
    public void debug(String msg)
    {
        if (isDebugEnabled())
        {
            log(SELF, java.util.logging.Level.FINE, msg, null);
        }
    }

    @Override
    public void debug(String format, Object arg)
    {
        if (isDebugEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            log(SELF, java.util.logging.Level.FINE, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String format, Object argA, Object argB)
    {
        if (isDebugEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            log(SELF, java.util.logging.Level.FINE, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String format, Object... arguments)
    {
        if (isDebugEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            log(SELF, java.util.logging.Level.FINE, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void debug(String msg, Throwable t)
    {
        if (isDebugEnabled())
        {
            log(SELF, java.util.logging.Level.FINE, msg, t);
        }
    }

    @Override
    public boolean isInfoEnabled()
    {
        return logger.isLoggable(java.util.logging.Level.INFO);
    }

    @Override
    public void info(String msg)
    {
        if (isInfoEnabled())
        {
            log(SELF, java.util.logging.Level.INFO, msg, null);
        }
    }

    @Override
    public void info(String format, Object arg)
    {
        if (isInfoEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            log(SELF, java.util.logging.Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String format, Object argA, Object argB)
    {
        if (isInfoEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            log(SELF, java.util.logging.Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String format, Object... arguments)
    {
        if (isInfoEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            log(SELF, java.util.logging.Level.INFO, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void info(String msg, Throwable t)
    {
        if (isInfoEnabled())
        {
            log(SELF, java.util.logging.Level.INFO, msg, t);
        }
    }

    @Override
    public boolean isWarnEnabled()
    {
        return logger.isLoggable(java.util.logging.Level.WARNING);
    }

    @Override
    public void warn(String msg)
    {
        if (isWarnEnabled())
        {
            log(SELF, java.util.logging.Level.WARNING, msg, null);
        }
    }

    @Override
    public void warn(String format, Object arg)
    {
        if (isWarnEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            log(SELF, java.util.logging.Level.WARNING, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String format, Object argA, Object argB)
    {
        if (isWarnEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            log(SELF, java.util.logging.Level.WARNING, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String format, Object... arguments)
    {
        if (isWarnEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            log(SELF, java.util.logging.Level.WARNING, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void warn(String msg, Throwable t)
    {
        if (isWarnEnabled())
        {
            log(SELF, java.util.logging.Level.WARNING, msg, t);
        }
    }

    @Override
    public boolean isErrorEnabled()
    {
        return logger.isLoggable(java.util.logging.Level.SEVERE);
    }

    @Override
    public void error(String msg)
    {
        if (isErrorEnabled())
        {
            log(SELF, java.util.logging.Level.SEVERE, msg, null);
        }
    }

    @Override
    public void error(String format, Object arg)
    {
        if (isErrorEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, arg);

            log(SELF, java.util.logging.Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String format, Object argA, Object argB)
    {
        if (isErrorEnabled())
        {
            FormattingTuple ft = MessageFormatter.format(format, argA, argB);

            log(SELF, java.util.logging.Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String format, Object... arguments)
    {
        if (isErrorEnabled())
        {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);

            log(SELF, java.util.logging.Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }
    }

    @Override
    public void error(String msg, Throwable t)
    {
        if (isErrorEnabled())
        {
            log(SELF, java.util.logging.Level.SEVERE, msg, t);
        }
    }


    private void log(String callerFQCN, java.util.logging.Level level, String msg, Throwable t)
    {
        LogRecord record = new LogRecord(level, msg);

        record.setLoggerName(name());

        record.setThrown(t);

        fillCallerData(callerFQCN, record);

        logger.log(record);
    }

    private static void fillCallerData(String callerFQCN, LogRecord record)
    {
        StackTraceElement[] steArray = new Throwable().getStackTrace();

        int selfIndex = -1;
        for (int i = 0; i < steArray.length; i++)
        {
            final String className = steArray[i].getClassName();
            if (className.equals(callerFQCN) || className.equals(SUPER))
            {
                selfIndex = i;
                break;
            }
        }

        int found = -1;
        for (int i = selfIndex + 1; i < steArray.length; i++)
        {
            final String className = steArray[i].getClassName();
            if (!(className.equals(callerFQCN) || className.equals(SUPER)))
            {
                found = i;
                break;
            }
        }

        if (found != -1)
        {
            StackTraceElement ste = steArray[found];
            record.setSourceClassName(ste.getClassName());
            record.setSourceMethodName(ste.getMethodName());
        }
    }
}
