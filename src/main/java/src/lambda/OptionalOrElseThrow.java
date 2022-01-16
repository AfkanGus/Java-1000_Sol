package src.lambda;

import java.util.List;
import java.util.Optional;

/**
 * 5.6. Optional. Методы orElseThrow()
 */
public class OptionalOrElseThrow {
    public static class User {
        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException {
    }

    public static User orElseThrow(List<User> list, String login) {
        Optional<User> optional =
                Optional.of(search(list, login).orElseThrow(UserNotFoundException::new));
        return optional.get();
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> user = Optional.empty();
        for (User u : list) {
            if (u.getLogin().equals(login)) {
                user = Optional.of(u);
                break;
            }
        }
        return user;
    }
}
