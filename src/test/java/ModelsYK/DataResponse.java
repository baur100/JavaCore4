package ModelsYK;

public class DataResponse {
    private Albums [] albums;
    private boolean allowDownload;
    private Artists [] artists;
    private String cdnUrl;
    private CurrentUser currentUser;
    private String currentVersion;
    private Interactions[] interactions;
    private String latestVersion;
    private Playlists [] playlists;
    private String [] recentlyPlayed;
    private Settings[] settings;
    private Songs [] songs;
    private boolean supportsTranscoding;
    private boolean useLastfm;
    private boolean useYouTube;
    private boolean useiTunes;
    private Users[] users;

    public Albums[] getAlbums() {
        return albums;
    }

    public boolean isAllowDownload() {
        return allowDownload;
    }

    public Artists[] getArtists() {
        return artists;
    }

    public String getCdnUrl() {
        return cdnUrl;
    }

    public CurrentUser getCurrentUser() {
        return currentUser;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public Interactions[] getInteractions() {
        return interactions;
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public Playlists[] getPlaylists() {
        return playlists;
    }

    public String[] getRecentlyPlayed() {
        return recentlyPlayed;
    }

    public Settings[] getSettings() {
        return settings;
    }

    public Songs[] getSongs() {
        return songs;
    }

    public boolean isSupportsTranscoding() {
        return supportsTranscoding;
    }

    public boolean isUseLastfm() {
        return useLastfm;
    }

    public boolean isUseYouTube() {
        return useYouTube;
    }

    public boolean isUseiTunes() {
        return useiTunes;
    }

    public Users[] getUsers() {
        return users;
    }
}
