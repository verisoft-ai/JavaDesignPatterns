namespace ChainOfResponsibility;

interface ISupportLevel
{
    void SetNext(ISupportLevel next);
    void HandleRequest(SupportTicket ticket);
}