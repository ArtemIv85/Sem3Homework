import java.util.ArrayList;
import java.util.Iterator;

public class StreemGroup implements  Iterable{
    public ArrayList<StudentGroup> streem = new ArrayList<>();

    public void addGroup(StudentGroup studentGroup){
        streem.add(studentGroup);

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "кол-во групп в потоке "+streem.size()+
                "  Группы=" +streem+
                '}'+
                "\n";
    }
}
