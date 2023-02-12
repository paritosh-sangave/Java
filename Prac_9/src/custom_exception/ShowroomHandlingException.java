package custom_exception;
//import java.lang.Object.Exception;

@SuppressWarnings("serial")
public class ShowroomHandlingException extends Exception
{
	public ShowroomHandlingException(String msg)
	{
		super(msg);
	}
}
