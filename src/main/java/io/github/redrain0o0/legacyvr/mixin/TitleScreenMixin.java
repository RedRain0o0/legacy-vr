package io.github.redrain0o0.legacyvr.mixin;

//import wily.legacy.client.ControlType;
//import wily.legacy.client.controller.ControllerBinding;
//import wily.legacy.client.screen.ControlTooltip;

//@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin /*extends Screen implements ControlTooltip.Event*/{
    //private static final Component CHOOSE_ACCOUNT = Component.translatable("legacyaccounts.menu.choose_account");

    //protected TitleScreenMixin(Component component) {
    //    super(component);
    //}

    //@Inject(method = "added", at = @At("RETURN"))
    //public void accountToolTip(CallbackInfo ci) {
    //    ControlTooltip.Renderer.of(this).add(()-> ControlType.getActiveType().isKbm() ? ControlTooltip.getKeyIcon(InputConstants.KEY_X) : ControllerBinding.LEFT_BUTTON.bindingState.getIcon(), ()-> CHOOSE_ACCOUNT);
    //}

    //public void added(ControlTooltip.Renderer renderer) {
    //    renderer.add(()-> ControlType.getActiveType().isKbm() ? ControlTooltip.getKeyIcon(InputConstants.KEY_X) : ControllerBinding.LEFT_BUTTON.bindingState.getIcon(), ()-> AuthScreen.PLAYERS_INVITE);
    //}
}