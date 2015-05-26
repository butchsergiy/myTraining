class BodyFlight{
	// ��������� ���������� �������:
	private final static double g=9.8;
	// ����������� ��� ���� �������������:
	private final static double gamma=0.005;
	// ���������� ��������:
	private final static int n=1000;
	// ������ �������:
	private double t;
	// ����:
	private Body body;
	
		// ������ ���������� ����:
	private void calculate(){
		// ����������, �������� � ����������:
		double x,y,dx,dy,Vx,Vy,dVx,dVy,dt;
		// ��������� ����������:
		int i;
		// ����:
		Force F=new Force();
		// ��������� ���������� � ��������:
		x=body.x;
		y=body.y;
		Vx=body.Vx;
		Vy=body.Vy;
		// ��� ������������ �� �������:
		dt=t/n;
		// ���������� ��������� � ��������:
		for(i=1;i<=n;i++){
		dx=Vx*dt;
		dy=Vy*dt;
		dVx=F.x(body)*dt/body.m;
		dVy=F.y(body)*dt/body.m;
		x+=dx;
		y+=dy;
		Vx+=dVx;
		Vy+=dVy;
		body.set(x,y,Vx,Vy);}}

		// ����������� ������:
	BodyFlight(double[] params)	{
		// ����� (������� �� ������� � ����������):
		double m=params[0]/1000;
		// ����������:
		double x=params[1];
		double y=params[2];
		// ���� � ���������:
		double alpha=Math.toRadians(params[4]);
		// ���������� ��������:
		double Vx=params[3]*Math.cos(alpha);
		double Vy=params[3]*Math.sin(alpha);
		// ������ ��� "����":
		body=new Body(m,x,y,Vx,Vy);
		// �����:
		this.t=params[5];
		// ������ ��������� ���� � ������ ������� t:
		calculate();
		// ����������� ���������� ��������:
		body.show();			}
		
		//���������� ����� ��� "����":
	class Body{
		// �����:
		double m;
		// ����������:
		double x;
		double y;
		// ���������� ��������:
		double Vx;
		double Vy;
		// ������ ��������:
		double V(){
		return Math.sqrt(Vx*Vx+Vy*Vy);}
		
		// ����� ��� ���������� ���� � ���������:
	double phi(){
		return Math.atan2(Vy,Vx);}
		// ����������� ����������� ������:
		Body(double m,double x,double y,double Vx,double Vy){
		this.m=m;
		set(x,y,Vx,Vy);}
		
		// ����� ��� ������������ �������� �����
		// (���������� � ���������� ��������):
	void set(double x,double y,double Vx,double Vy){
		this.x=x;
		this.y=y;
		this.Vx=Vx;
		this.Vy=Vy;}
		
		// ����� ��� ����������� ���������� �������:
	void show(){
			double alpha=Math.round(Math.toDegrees(phi())*100)/100.0;
			System.out.println("� ������ ������� t="+t+" ������ ��������� ���� ���������.");
			System.out.println("������: "+Math.round(y*100)/100.0+" ������ ��� ����������.");
			System.out.println("���������� �� ����� ������: "+Math.round(x*100)/100.0+"	������.");
			System.out.println("��������: "+Math.round(V()*100)/100.0+" ������ � �������.");
			System.out.println("���� � ���������: "+alpha+" ��������.");}
			}
	
			// ���������� ����� ��� "����":
		class Force{
			// �������� �� �������������� ���:
			double x(Body obj){
			return -gamma*obj.Vx;}
			// �������� �� ������������ ���:
			double y(Body obj){
			return -g*obj.m-gamma*obj.Vy;}
	}}
	

public class C08_BodyFlightDemo {
	public static void main(String[] args) {
		// ��������� (����� (� �������), ��������� ���������� (� ������),
		// �������� (� �/�)), ���� (� ��������) � ����� (� ��������)):
		double[] params={100,0,0,150,30,13};
		// ��������� ������:
		new BodyFlight(params);

}}
