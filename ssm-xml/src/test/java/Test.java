import com.atguigu.pojo.Bangumi;
import com.atguigu.service.BangumiService;
import com.github.pagehelper.PageInfo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class Test {

    @Autowired
    BangumiService bangumiService;

    @org.junit.Test
    public void get(){
        PageInfo<Bangumi> page = bangumiService.getByPage(
                new Bangumi(),1,2);
        System.out.println(page);
    }
//    Page{
//        count=true,
//        pageNum=1,
//        pageSize=5,
//        startRow=0,
//        endRow=5,
//        total=209,
//        pages=42,
//        reasonable=false,
//        pageSizeZero=false
//        }
//        [
//        Bangumi{id=220, name='异世界舅舅', type=1, time=7, status=2, year=2022, picture='http://lain.bgm.tv/pic/cover/l/1a/75/339326_v466V.jpg', userId='2'},
//        Bangumi{id=219, name='邪神与厨二病少女’', type=1, time=4, status=2, year=2020, picture='http://lain.bgm.tv/pic/cover/l/cb/30/272188_DPj3G.jpg', userId='2'},
//        Bangumi{id=218, name='邪神与厨二病少女 X丨豆动画～北海道篇～', type=3, time=4, status=2, year=2022, picture='http://lain.bgm.tv/pic/cover/l/49/29/375987_MKkUT.jpg', userId='2'},
//        Bangumi{id=217, name='邪神与厨二病少女', type=1, time=7, status=2, year=2018, picture='http://lain.bgm.tv/pic/cover/l/49/c0/231722_1DDIx.jpg', userId='2'},
//        Bangumi{id=216, name='邪神与厨二病少女 X', type=1, time=7, status=2, year=2022, picture='http://lain.bgm.tv/pic/cover/l/4b/90/316131_179OO.jpg', userId='2'}]
}
