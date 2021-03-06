package server.logic.rmi;

import brugerautorisation.data.Bruger;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;

public final class GameLobby extends UnicastRemoteObject implements IGameLobby {

    private final server.logic.local.IGameLobby lobby;

    public GameLobby() throws RemoteException {
        try {
            lobby = new server.logic.local.GameLobby();
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public void logIn(String username, String password) throws RemoteException {
        try {
            lobby.logIn(username, password);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public void logOut(String username) throws RemoteException {
        try {
            lobby.logOut(username);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public IGameLogic getGameLogicInstance(String username) throws RemoteException {
        try {
            return lobby.getGameLogicInstance(username);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public List<String> getAllCurrentUserNames() throws RemoteException {
        try {
            return lobby.getAllCurrentUserNames();
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public int getUserAmount() throws RemoteException {
        try {
            return lobby.getUserAmount();
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public Bruger getLoggedInUser(String username) throws RemoteException {
        try {
            return lobby.getLoggedInUser(username);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public boolean isLoggedIn(String username) throws RemoteException {
        try {
            return lobby.isLoggedIn(username);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public Bruger getUserWithHighestHighscore() throws RemoteException {
        try {
            return lobby.getUserWithHighestHighscore();
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public void setUserHighscore(String username, String highscore) throws RemoteException {
        try {
            lobby.setUserHighscore(username, highscore);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public String getUserHighscore(String username) throws RemoteException {
        try {
            return lobby.getUserHighscore(username);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public Map<String, Integer> getAllLoggedInUsersScore() throws RemoteException {
        try {
            return lobby.getAllLoggedInUsersScore();
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public Map<String, Integer> getAllUsersHighscore() throws RemoteException {
        try {
            return lobby.getAllUsersHighscore();
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public List<String> getAllWords() throws RemoteException {
        try {
            return lobby.getAllWords();
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public void sendUserEmail(String username, String password, String subject, String msg) throws RemoteException {
        try {
            lobby.sendUserEmail(username, password, subject, msg);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public void sendForgotPasswordEmail(String username, String msg) throws RemoteException {
        try {
            lobby.sendForgotPasswordEmail(username, msg);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override
    public void changeUserPassword(String username, String oldPassword, String newPassword) throws RemoteException {
        try {
            lobby.changeUserPassword(username, oldPassword, newPassword);
        } catch (server.logic.local.IGameLobby.GameLobbyException e) {
            throw new RemoteException(e.getMessage());
        }
    }

}