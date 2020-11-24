
public class UserRegistrationProbException extends Exception {
		enum ExceptionType {
			INVALID;
		}
		
		private ExceptionType type;

		public ExceptionType getType() {
			return type;
		}


		public UserRegistrationProbException(ExceptionType type, String message) {
			super(message);
			this.type=type;
		}

	}
