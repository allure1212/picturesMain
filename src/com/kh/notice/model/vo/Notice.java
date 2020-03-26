package com.kh.notice.model.vo;

public class Notice {

   /* NOTICE_NO */
   private int noticeNo;

   /* NOTICE_TYPE */
   private String noticeType;

   /* NOTICE_TITLE */
   private String noticeTitle;

   /* NOTICE_CONTENT */
   private String noticeContent;

   /* NOTICE_DATE */
   private Object noticeDate;

   /* REFERENCE */
   private int reference;
   
   public Notice() {
	   
   }

	public Notice(int noticeNo, String noticeType, String noticeTitle, String noticeContent, Object noticeDate,
			int reference) {
		super();
		this.noticeNo = noticeNo;
		this.noticeType = noticeType;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeDate = noticeDate;
		this.reference = reference;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Object getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Object noticeDate) {
		this.noticeDate = noticeDate;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeType=" + noticeType + ", noticeTitle=" + noticeTitle
				+ ", noticeContent=" + noticeContent + ", noticeDate=" + noticeDate + ", reference=" + reference + "]";
	}
	

}



