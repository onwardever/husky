package info.yangdian.husky.log;

public interface Logger
{
    String name();

    boolean isTraceEnabled();

    void trace(String msg);

    void trace(String format, Object arg);

    void trace(String format, Object argA, Object argB);

    void trace(String format, Object... arguments);

    void trace(String msg, Throwable t);


    boolean isDebugEnabled();

    void debug(String msg);

    void debug(String format, Object arg);

    void debug(String format, Object argA, Object argB);

    void debug(String format, Object... arguments);

    void debug(String msg, Throwable t);


    boolean isInfoEnabled();

    void info(String msg);

    void info(String format, Object arg);

    void info(String format, Object argA, Object argB);

    void info(String format, Object... arguments);

    void info(String msg, Throwable t);


    boolean isWarnEnabled();

    void warn(String msg);

    void warn(String format, Object arg);

    void warn(String format, Object argA, Object argB);

    void warn(String format, Object... arguments);

    void warn(String msg, Throwable t);


    boolean isErrorEnabled();

    void error(String msg);

    void error(String format, Object arg);

    void error(String format, Object argA, Object argB);

    void error(String format, Object... arguments);

    void error(String msg, Throwable t);


    boolean isEnabled(Level level);

    void log(Level level, String msg);

    void log(Level level, String format, Object arg);

    void log(Level level, String format, Object argA, Object argB);

    void log(Level level, String format, Object... arguments);

    void log(Level level, String msg, Throwable t);


    enum Level
    {
        TRACE,

        DEBUG,

        INFO,

        WARN,

        ERROR
    }

}
