package com.xaviermcmage.letsmodreboot.client.handler;

import com.xaviermcmage.letsmodreboot.client.settings.Keybindings;
import com.xaviermcmage.letsmodreboot.reference.Key;
import com.xaviermcmage.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    // Returns upon keyPressed and keyReleased for some reason.
    private static Key getPressedKeybinding ()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
}
