package SorteOpgaver.ch11.aske1208_a_11_19;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class nineteen
{
    private int theRarest;
    public Integer rarest(Map<String, Integer> map)
    {
        Integer value = null;
        Integer frequency = null;

        for (Map.Entry<String, Integer> m : map.entrySet())
        {
            if (frequency == null)
            {
                frequency = Collections.frequency(map.values(), m.getValue());
            }
            if (Collections.frequency(map.values(), m.getValue()) <= frequency)
            {
                frequency = Collections.frequency(map.values(), m.getValue());
                if (Collections.frequency(map.values(), m.getValue()) == frequency)
                {
                    if (value == null)
                    {
                        value = m.getValue();
                    }else
                    {
                        if (value < m.getValue())
                        {
                            value = m.getValue();
                        }
                    }
                }
            }
        }

        return value;
    }
}
