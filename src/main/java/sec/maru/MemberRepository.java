package sec.maru;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface MemberRepository {

    List<Member> getUserList();

    int totalAccount();

    int loginCheck();

}
