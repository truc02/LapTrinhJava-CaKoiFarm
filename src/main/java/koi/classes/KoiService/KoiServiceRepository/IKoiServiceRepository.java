package koi.classes.KoiService.KoiServiceRepository;

import koi.classes.KoiService.KoiService;

import java.util.List;

public interface IKoiServiceRepository {
    public void add(KoiService koiService);
    public void delete(int id);
    public void update(KoiService koiService);
    public KoiService findById(int id);
    public List<KoiService> findAll();
}
