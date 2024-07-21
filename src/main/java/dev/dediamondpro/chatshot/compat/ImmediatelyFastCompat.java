package dev.dediamondpro.chatshot.compat;

import net.raphimc.immediatelyfastapi.ApiAccess;
import net.raphimc.immediatelyfastapi.ImmediatelyFastApi;

public class ImmediatelyFastCompat implements ICompatHandler {
    private final ApiAccess api = ImmediatelyFastApi.getApiImpl();

    @Override
    public void drawChatHud() {
        if (api.getBatching().isHudBatching()) {
            api.getBatching().forceDrawBuffers();
        }
    }
}
