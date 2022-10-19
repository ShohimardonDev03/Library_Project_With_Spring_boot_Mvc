package uz.library.service;

import uz.library.entity.Publisher;

import java.util.List;

public interface PublisherService {
    public List<Publisher> findAll();

  public Publisher findById(int theId);

    public void save(Publisher thePublisher);

    public void deleteById(int theId);
}
