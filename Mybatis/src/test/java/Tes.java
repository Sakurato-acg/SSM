import com.atguigu.mybatis.Utils.SqlSessionFactoryUtils;
import com.atguigu.mybatis.mapper.BangumiMapper;
import com.atguigu.mybatis.pojo.Bangumi;
import com.atguigu.mybatis.pojo.BangumiExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

@SuppressWarnings("all")
public class Tes {
    private SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
    @Test
    public void main1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BangumiMapper mapper = sqlSession.getMapper(BangumiMapper.class);

        BangumiExample bangumiExample = new BangumiExample();
        bangumiExample.createCriteria().andYearGreaterThanOrEqualTo(2022);

        List<Bangumi> bangumis = mapper.selectByExample(bangumiExample);

        bangumis.forEach(System.out::println);
        sqlSession.close();

    }
}
