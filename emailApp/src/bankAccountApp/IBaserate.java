package bankAccountApp;

public interface IBaserate {

	default double getBaseRate() {

		return 2.5;
	}

}
