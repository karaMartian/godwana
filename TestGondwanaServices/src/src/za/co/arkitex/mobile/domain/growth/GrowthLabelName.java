package za.co.arkitex.mobile.domain.growth;

public class GrowthLabelName {

	private String mtdDefault;
	private String mtdPrevious;
	private String previousMonthMTD;
	private String ytdDefault;
	private String ytdPrevious;
	
	public String getMtdDefault() {
		return mtdDefault;
	}
	public void setMtdDefault(String mtdDefault) {
		this.mtdDefault = mtdDefault;
	}
	public String getMtdPrevious() {
		return mtdPrevious;
	}
	public void setMtdPrevious(String mtdPrevious) {
		this.mtdPrevious = mtdPrevious;
	}
	public String getPreviousMonthMTD() {
		return previousMonthMTD;
	}
	public void setPreviousMonthMTD(String previousMonthMTD) {
		this.previousMonthMTD = previousMonthMTD;
	}
	public String getYtdDefault() {
		return ytdDefault;
	}
	public void setYtdDefault(String ytdDefault) {
		this.ytdDefault = ytdDefault;
	}
	public String getYtdPrevious() {
		return ytdPrevious;
	}
	public void setYtdPrevious(String ytdPrevious) {
		this.ytdPrevious = ytdPrevious;
	}
	
	public String toString() {
		return 	mtdDefault + " " +  mtdPrevious + " " + previousMonthMTD + " " + ytdDefault + " " + ytdPrevious;
	}
	
}
