import com.dawn.oa.entity.User;
import com.dawn.oa.service.UserService;
import com.dawn.oa.utils.MybatisUtils;
import org.junit.Test;

public class MybatisUtilsTestor {
    @Test
    public void TestCase1(){
        String result = (String) MybatisUtils.executeQuery(sqlSession -> {
            String out = (String) sqlSession.selectOne("test.sample");
            return out;
        });
        System.out.println(result);
    }
    @Test
    public void TestCase2(){
        String result = (String) MybatisUtils.executeQuery(sqlSession->sqlSession.selectOne("test.sample"));
        System.out.println(result);
    }
}
