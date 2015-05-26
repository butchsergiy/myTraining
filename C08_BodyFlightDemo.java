class BodyFlight{
	// Ускорение свободного падения:
	private final static double g=9.8;
	// Коэффициент для силы сопротивления:
	private final static double gamma=0.005;
	// Количество итераций:
	private final static int n=1000;
	// Момент времени:
	private double t;
	// Тело:
	private Body body;
	
		// Расчет траектории тела:
	private void calculate(){
		// Координаты, скорость и приращения:
		double x,y,dx,dy,Vx,Vy,dVx,dVy,dt;
		// Индексная переменная:
		int i;
		// Сила:
		Force F=new Force();
		// Начальные координаты и скорость:
		x=body.x;
		y=body.y;
		Vx=body.Vx;
		Vy=body.Vy;
		// Шаг дискретности по времени:
		dt=t/n;
		// Вычисление координат и скорости:
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

		// Конструктор класса:
	BodyFlight(double[] params)	{
		// Масса (перевод из граммов в килограммы):
		double m=params[0]/1000;
		// Координаты:
		double x=params[1];
		double y=params[2];
		// Угол к горизонту:
		double alpha=Math.toRadians(params[4]);
		// Компоненты скорости:
		double Vx=params[3]*Math.cos(alpha);
		double Vy=params[3]*Math.sin(alpha);
		// Объект для "тела":
		body=new Body(m,x,y,Vx,Vy);
		// Время:
		this.t=params[5];
		// Расчет положения тела в момент времени t:
		calculate();
		// Отображение результата расчетов:
		body.show();			}
		
		//Внутренний класс для "тела":
	class Body{
		// Масса:
		double m;
		// Координаты:
		double x;
		double y;
		// Компоненты скорости:
		double Vx;
		double Vy;
		// Модуль скорости:
		double V(){
		return Math.sqrt(Vx*Vx+Vy*Vy);}
		
		// Метод для вычисления угла к горизонту:
	double phi(){
		return Math.atan2(Vy,Vx);}
		// Конструктор внутреннего класса:
		Body(double m,double x,double y,double Vx,double Vy){
		this.m=m;
		set(x,y,Vx,Vy);}
		
		// Метод для присваивания значений полям
		// (координаты и компоненты скорости):
	void set(double x,double y,double Vx,double Vy){
		this.x=x;
		this.y=y;
		this.Vx=Vx;
		this.Vy=Vy;}
		
		// Метод для отображения параметров объекта:
	void show(){
			double alpha=Math.round(Math.toDegrees(phi())*100)/100.0;
			System.out.println("В момент времени t="+t+" секунд положение тела следующее.");
			System.out.println("Высота: "+Math.round(y*100)/100.0+" метров над горизонтом.");
			System.out.println("Расстояние от точки броска: "+Math.round(x*100)/100.0+"	метров.");
			System.out.println("Скорость: "+Math.round(V()*100)/100.0+" метров в секунду.");
			System.out.println("Угол к горизонту: "+alpha+" градусов.");}
			}
	
			// Внутренний класс для "силы":
		class Force{
			// Проекция на горизонтальную ось:
			double x(Body obj){
			return -gamma*obj.Vx;}
			// Проекция на вертикальную ось:
			double y(Body obj){
			return -g*obj.m-gamma*obj.Vy;}
	}}
	

public class C08_BodyFlightDemo {
	public static void main(String[] args) {
		// Параметры (масса (в граммах), начальные координаты (в метрах),
		// скорость (в м/с)), угол (в градусах) и время (в секундах)):
		double[] params={100,0,0,150,30,13};
		// Анонимный объект:
		new BodyFlight(params);

}}
