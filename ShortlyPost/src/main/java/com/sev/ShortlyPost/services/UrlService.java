package com.sev.ShortlyPost.services;

import com.sev.ShortlyPost.model.Url;
import com.sev.ShortlyPost.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {

    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);

    public void deleteShortLink(Url url);
}
