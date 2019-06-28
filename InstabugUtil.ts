import Instabug, { BugReporting } from 'instabug-reactnative';

export class BugReportUtils {

  static presentFeedbackUI = () => {
    Instabug.show();
  };
}
