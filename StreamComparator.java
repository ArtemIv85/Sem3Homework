import java.util.Comparator;

public class StreamComparator implements Comparator<StreemGroup>{

    @Override
    public int compare(StreemGroup o1, StreemGroup o2) {
        return o1.streem.size()-o2.streem.size();
    }
}
