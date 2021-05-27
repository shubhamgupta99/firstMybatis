package resouce;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Mapper.UsersMapper;
import Model.Users;

@RestController
@RequestMapping("/users")
public class UsersResource {

    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }


    @GetMapping("/all")
    public void ac()
    {
    	System.out.print("SHUBHAM");
    }
    @GetMapping("/update")
    private List<Users> update() {

        Users users = new Users();
        users.setName("Youtube");
        users.setSalary(2333L);

        usersMapper.insert(users);
        return usersMapper.findAll();
    }
}