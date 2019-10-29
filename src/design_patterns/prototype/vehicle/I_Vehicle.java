package design_patterns.prototype.vehicle;

public interface I_Vehicle extends Cloneable {
    public abstract void setName(String name);
    public abstract void setPower(int power);
    public abstract void setSeats(int seats);
    public abstract String getInfo();

    public abstract void addVehicle();

    public Object clone();
}
