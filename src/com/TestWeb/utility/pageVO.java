package com.TestWeb.utility;

public class pageVO {
	private int startPage;
	private int endPage;
	private boolean prev, next;

	private int pageNum;
	private int amount = 10;
	private int total;

	public pageVO(int pageNum, int amount, int total) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.total = total;
		
		this.endPage = (int) Math.ceil((this.pageNum / 10.0) * 10);
		this.startPage = this.endPage - 9;

		int realend = (int) Math.ceil(this.total / (double) this.amount);
		// 마지막 페이지떄 보여지는 끝번호가 달라짐.

		if (this.endPage > realend) {
			this.endPage = realend;
		}

		this.prev = this.startPage > 1;

		this.next = this.endPage < realend;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	// ======================================

}
