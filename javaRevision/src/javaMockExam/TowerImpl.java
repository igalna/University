package javaMockExam;

import lombok.Data;

@Data
public class TowerImpl implements Tower {
	
	private double x;
	private double y;
	private double r;

	private TowerImpl(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public static Tower towerFactory(double x, double y, double r) {
		return new TowerImpl(x, y, r);
	}
	
	@Override
	public boolean inRange(double x0, double y0) {
		double distance = Math.sqrt(((this.x - x0) * 2) + ((this.y * y0) * 2));
		if (distance <= this.r)
			return true;
		else
			return false;
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public double getR() {
		return r;
	}
}
