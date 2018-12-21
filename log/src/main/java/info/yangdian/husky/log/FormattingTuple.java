package info.yangdian.husky.log;

final class FormattingTuple
{
    private String message;

    private Throwable throwable;

    public FormattingTuple() {}

    public FormattingTuple(String message, Throwable throwable)
    {
        this.message = message;
        this.throwable = throwable;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Throwable getThrowable()
    {
        return throwable;
    }

    public void setThrowable(Throwable throwable)
    {
        this.throwable = throwable;
    }
}
