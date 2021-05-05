import { EventObject, ImageValue, Listeners, Widget } from 'tabris';

declare global {

  namespace custom {

    export class FloatingActionButton extends Widget {

      public readonly onSelect: Listeners<EventObject<this>>;

      public image: ImageValue;

      constructor(properties: Partial<FloatingActionButton>);

      public show(): void;

      public hide(): void;

    }

  }

}
