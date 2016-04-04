package dynamusic;

import atg.nucleus.GenericService;
import atg.repository.*;

public class SongsManager extends GenericService {
	
	private Repository repository = null;

	public Repository getRepository() { 
		return repository;
	} 

	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	
	public void deleteAlbumsByArtist(String pArtistId) throws RepositoryException{
		if (isLoggingDebug()) {
	        logDebug("Delete artist" + pArtistId);
	    }
	}

	public SongsManager() {}


}
