package extendsExam;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	/*
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	*/
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}	
	
	public int getAgentID() {
		return agentID;
	}
	
	public void setAgentID(int AgentID) {
		this.agentID = AgentID;
	}
	
}
