import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Main {
	public static void main(String args[])
	{
		PasswordEncoder pe=new BCryptPasswordEncoder();
		System.out.println(pe.encode("qwerty"));
	}
}
