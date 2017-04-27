package Models;

import Controllers.AbstractControllers.UserRepository;

/**
 * Created by Zonde on 27-03-2017.
 */
public class Validator
{
    UserRepository repo;
    public Validator(UserRepository repo)
    {
        this.repo = repo;
    }

    private boolean passwordCheck(String username, String password)
    {
        boolean passwordIsValid = true;

        if(repo.passwordValid(password,username))
        {
            passwordIsValid = true;
        }
        else if(!repo.passwordValid(password,username))
        {
            passwordIsValid = false;
        }
        else
        {
        }
        return passwordIsValid;
    }

    private boolean usernameCheck(String username)
    {
        boolean usernameIsValid = true;

        if(repo.usernameValid(username))
        {
            usernameIsValid = true;
        }
        else if(!repo.usernameValid(username))
        {
            usernameIsValid = false;
        }
        else
        {
        }
        return usernameIsValid;
    }

    private boolean passwordFormatCheck(String password)
    {
        return false;
    }
    private boolean usernameFormatCheck(String username)
    {
        return false;
    }
}
