package mk.finki.ukim.emt.user.services.impl;

import mk.finki.ukim.emt.user.domain.models.User;
import mk.finki.ukim.emt.user.services.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return user;
    }
}
