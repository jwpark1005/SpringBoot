package sec.maru;

public class Member {

    String userid;
    String uname;
    String userpwd;

    public Member(String userid, String uname, String userpwd) {
        this.userid = userid;
        this.uname = uname;
        this.userpwd = userpwd;
    }

    public Member() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

}
