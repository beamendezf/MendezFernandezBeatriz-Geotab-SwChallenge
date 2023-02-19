package me.client;

import com.google.gwt.core.client.EntryPoint;
import com.intendia.rxgwt2.elemento.RxElemento;
import elemental2.dom.HTMLElement;
import org.jboss.elemento.Elements;

import static elemental2.dom.DomGlobal.document;
import static org.jboss.elemento.EventType.mousemove;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        HTMLElement el = Elements.span().style("font-weight: bold; background: red").element();
        Elements.body().add("mouse position: ").add(el);
        RxElemento.fromEvent(document, mousemove)
                .subscribe(ev -> el.textContent = ev.clientX + ", " + ev.clientY);
    }
}