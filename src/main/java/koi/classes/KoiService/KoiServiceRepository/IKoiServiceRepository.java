package koi.classes.KoiService.KoiServiceRepository;

import koi.classes.KoiService.KoiService;

public interface IKoiServiceRepository {
    public void add(KoiService koiService);
    public void delete(int id);
    public void update(KoiService koiService);
    public KoiService findById(int id);
}
