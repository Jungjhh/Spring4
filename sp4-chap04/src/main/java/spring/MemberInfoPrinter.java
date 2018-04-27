package spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {
	
	/*@Autowired*/
	/*@Resource(name="memberDao")*/
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	/*@Autowired*/
	/*@Resource(name="memberPrinter")*/
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email) {
		System.out.println("info : "+memberDao);
		Member member = memberDao.selectByEmail(email);
		if(member ==null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

}
