package by.belstu.it.Bialitski;

import java.util.Objects;

public class WrapperString {
    private String Name;

    public WrapperString(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(Name, that.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "Name='" + Name + '\'' +
                '}';
    }
    public void replace(char oldchar,char newchar){

    }

    public void delete(char o) {
    }
}
