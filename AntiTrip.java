public
class AntiTrip extends Module {

    public
    AntiTrip() {
        super("AntiTrip", "Teleports u to the latest ground pos in case u trip and fall.", Category.PLAYER, true, false, false);
    }

    @Override
    public
    void onUpdate() {
        if (mc.player.fallDistance < 3.0) {
            mc.player.connection.sendPacket(new CPacketPlayer.Position(mc.player.posX, mc.player.posY + 2, mc.player.posZ, true));
            this.toggle();
        }
    }
} 
