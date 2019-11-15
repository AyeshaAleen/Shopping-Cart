package com.Services;

import com.Domain.CDs;
import com.Repository.CDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CDServices {

    @Autowired
    private CDRepository cdRepository;

  /*  private List<CDs> cds = new ArrayList<>(Arrays.asList(
            new CDs("Rock", "Abc", 0.0),
            new CDs("Rock", "Abc", 0.0),
            new CDs("Rock", "Abc", 0.0),
            new CDs("Rock", "Abc", 0.0)
    ));  */

    public List<CDs> getAllCD()
    {
       // return cds;
        List<CDs> cds = new ArrayList<>();
        cdRepository.findAll().forEach(cds :: add);
        return cds;
    }

    public void addCD(CDs cd)
    {
       // cds.add(book);
        cdRepository.save(cd);
    }

    public void deleteCD(long id)
    {
       // cds.removeIf(t -> t.getId() == id);
        cdRepository.deleteById(id);
    }

    public void updateCD(long id, CDs cd)
    {
     /*   for (int i = 0; i <= cds.size(); i++)
        {
            CDs b = cds.get(i);
            if (b.getId() == (id))
            {
                cds.set(i, book);
                return;
            }
        }  */
        cdRepository.save(cd);
    }

    public CDs getCD (long id)
    {
        //return cds.stream().filter(t -> t.getId() == (id)).findFirst().get();
        return cdRepository.findById(id).orElse(null);
    }
}
