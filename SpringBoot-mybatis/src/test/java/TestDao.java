import com.Application;
import com.dao.CityDao;
import com.domain.City;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author cyf
 * @description
 * @create 2018-09-19 9:45
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDao {

    @Autowired
    private CityDao cityDao;


    @Test
    public void testUpdate(){
        City city = new City();
        city.setId(5);
        city.setCityName("中国城市No1");

        City city2 = new City();
        city2.setId(6);
        city2.setCityName("中国城市No2");
        List<City> list = Arrays.asList(city, city2);
        int i = cityDao.batchUpdate(list);
        System.out.printf("i is %d ", i);
    }

}
