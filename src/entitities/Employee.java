package entitities;

public class Employee {
    private String name;
    private Integer dayNumberWorked;
    private Integer valueOftheDayWorked;

    public Employee() {
    }

    public Employee(String name, Integer dayNumberWorked, Integer valueOftheDayWorked) {
        this.name = name;
        this.dayNumberWorked = dayNumberWorked;
        this.valueOftheDayWorked = valueOftheDayWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDayNumberWorked() {
        return dayNumberWorked;
    }

    public void setDayNumberWorked(Integer dayNumberWorked) {
        this.dayNumberWorked = dayNumberWorked;
    }

    public Integer getValueOftheDayWorked() {
        return valueOftheDayWorked;
    }

    public void setValueOftheDayWorked(Integer valueOftheDayWorked) {
        this.valueOftheDayWorked = valueOftheDayWorked;
    }

   public double salaryEmployee(){
        return dayNumberWorked * valueOftheDayWorked;
   }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dayNumberWorked=" + dayNumberWorked +
                ", valueOftheDayWorked=" + valueOftheDayWorked +
                '}';
    }
}
